package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZTE_TV device specifications for Android Compose previews.
 *
 * This extension provides ZTE_TV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZteTv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZteTv: Any
  get() = object {
      /** ZTE_TV B866_ZTE */
      val B866_ZTE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
