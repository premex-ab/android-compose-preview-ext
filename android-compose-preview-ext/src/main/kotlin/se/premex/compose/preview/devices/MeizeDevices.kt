package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MEIZE device specifications for Android Compose previews.
 *
 * This extension provides MEIZE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meize.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meize: Any
  get() = object {
      /** MEIZE D105 */
      val D105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEIZE D106 */
      val D106 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** MEIZE D115 */
      val D115 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEIZE D125_EEA */
      val D125_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEIZE D126 */
      val D126 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MEIZE D126_EEA */
      val D126_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
