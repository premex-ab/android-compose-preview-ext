package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VGOTEL device specifications for Android Compose previews.
 *
 * This extension provides VGOTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vgotel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vgotel: Any
  get() = object {
      /** VGOTEL NEW_15 */
      val NEW_15 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** VGOTEL NEW_15_Pro */
      val NEW_15_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** VGOTEL NEW_24 */
      val NEW_24 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** VGOTEL NEW_25 */
      val NEW_25 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** VGOTEL NEW_26 */
      val NEW_26 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** VGOTEL NEW_7 */
      val NEW_7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** VGOTEL NOTE_24 */
      val NOTE_24 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** VGOTEL Ocean9L */
      val OCEAN9L = "spec:width=480,height=854,unit=px,dpi=240"

      /** VGOTEL Ocean_9 */
      val OCEAN_9 = "spec:width=480,height=854,unit=px,dpi=240"

      /** VGOTEL Smart_2 */
      val SMART_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** VGOTEL Smart_4 */
      val SMART_4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** VGOTEL Smart_5 */
      val SMART_5 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** VGOTEL Smart_7 */
      val SMART_7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** VGOTEL VentureV10 */
      val VENTUREV10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VGOTEL Venture_V12 */
      val VENTURE_V12 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VGOTEL VGOTEL_OCEAN_6 */
      val VGOTEL_OCEAN_6 = "spec:width=480,height=854,unit=px,dpi=240"

  }
