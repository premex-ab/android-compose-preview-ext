package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * b-box device specifications for Android Compose previews.
 *
 * This extension provides b-box device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BBox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BBox: Any
  get() = object {
      /** b-box HP44H */
      val HP44H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
