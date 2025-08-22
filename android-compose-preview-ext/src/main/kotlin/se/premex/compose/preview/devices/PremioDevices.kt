package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Premio device specifications for Android Compose previews.
 *
 * This extension provides Premio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Premio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Premio: Any
  get() = object {
      /** Premio HMR5510 */
      val HMR5510 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Premio Premio */
      val PREMIO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Premio Premio_P420 */
      val PREMIO_P420 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Premio S54 */
      val S54 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Premio S55 */
      val S55 = "spec:width=540,height=960,unit=px,dpi=240"

      /** Premio S56 */
      val S56 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Premio S57 */
      val S57 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Premio S75 */
      val S75 = "spec:width=480,height=960,unit=px,dpi=220"

      /** Premio S86 */
      val S86 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Premio S87 */
      val S87 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Premio S94 */
      val S94 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Premio X70-2021 */
      val X70_2021 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Premio X75-2021 */
      val X75_2021 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Premio X80 */
      val X80 = "spec:width=480,height=996,unit=px,dpi=240"

      /** Premio X81 */
      val X81 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** Premio X83 */
      val X83 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Premio X84 */
      val X84 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Premio X85 */
      val X85 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Premio X85_PRO */
      val X85_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Premio X86 */
      val X86 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Premio X91 */
      val X91 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Premio 186HS1080233 */
      val _186HS1080233 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
