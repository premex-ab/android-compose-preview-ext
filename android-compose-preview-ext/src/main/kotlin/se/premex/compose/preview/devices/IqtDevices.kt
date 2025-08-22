package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * iQT device specifications for Android Compose previews.
 *
 * This extension provides iQT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iqt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iqt: Any
  get() = object {
      /** iQT iQT_N8 */
      val IQT_N8 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** iQT N3 */
      val N3 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** iQT N6 */
      val N6 = "spec:width=480,height=996,unit=px,dpi=240"

  }
