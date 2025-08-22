package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AllVIEW device specifications for Android Compose previews.
 *
 * This extension provides AllVIEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Allview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Allview: Any
  get() = object {
      /** AllVIEW X6_Soul_mini */
      val X6_SOUL_MINI = "spec:width=720,height=1520,unit=px,dpi=320"

  }
