package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ALTICE device specifications for Android Compose previews.
 *
 * This extension provides ALTICE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Altice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Altice: Any
  get() = object {
      /** ALTICE E54 */
      val E54 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALTICE E55 */
      val E55 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** ALTICE S11 */
      val S11 = "spec:width=480,height=800,unit=px,dpi=240"

      /** ALTICE S12 */
      val S12 = "spec:width=480,height=800,unit=px,dpi=240"

      /** ALTICE S22 */
      val S22 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ALTICE S32 */
      val S32 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALTICE S32_Plus */
      val S32_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALTICE S33 */
      val S33 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ALTICE S35 */
      val S35 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** ALTICE S42 */
      val S42 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** ALTICE S43 */
      val S43 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** ALTICE S60 */
      val S60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ALTICE S61 */
      val S61 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ALTICE S64 */
      val S64 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** ALTICE S70 */
      val S70 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ALTICE STARACTIVE */
      val STARACTIVE = "spec:width=480,height=854,unit=px,dpi=240"

      /** ALTICE STARNAUTE4 */
      val STARNAUTE4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ALTICE STARTRAIL7 */
      val STARTRAIL7 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ALTICE STARXTREM5 */
      val STARXTREM5 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
