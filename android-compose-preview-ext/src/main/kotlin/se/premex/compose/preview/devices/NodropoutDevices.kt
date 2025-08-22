package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NODROPOUT device specifications for Android Compose previews.
 *
 * This extension provides NODROPOUT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nodropout.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nodropout: Any
  get() = object {
      /** NODROPOUT T25 */
      val T25 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
