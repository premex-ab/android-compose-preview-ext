package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NowTV device specifications for Android Compose previews.
 *
 * This extension provides NowTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nowtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nowtv: Any
  get() = object {
      /** NowTV 3103 */
      val _3103 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
