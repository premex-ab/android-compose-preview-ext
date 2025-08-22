package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Marshall device specifications for Android Compose previews.
 *
 * This extension provides Marshall device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Marshall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Marshall: Any
  get() = object {
      /** Marshall KB-1501 */
      val KB_1501 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
