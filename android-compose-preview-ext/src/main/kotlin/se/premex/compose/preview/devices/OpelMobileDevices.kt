package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Opel_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Opel_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OpelMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OpelMobile: Any
  get() = object {
      /** Opel_Mobile Easy_Smart_2 */
      val EASY_SMART_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Opel_Mobile OMS5525B */
      val OMS5525B = "spec:width=480,height=960,unit=px,dpi=200"

      /** Opel_Mobile OMS55Q23B */
      val OMS55Q23B = "spec:width=480,height=960,unit=px,dpi=200"

      /** Opel_Mobile OMS65E24B */
      val OMS65E24B = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Opel_Mobile OMS65Q23B */
      val OMS65Q23B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Opel_Mobile OMS65R24B */
      val OMS65R24B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Opel_Mobile OMSX6524B */
      val OMSX6524B = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Opel_Mobile SmartX6 */
      val SMARTX6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Opel_Mobile SmartZ6 */
      val SMARTZ6 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** Opel_Mobile Smart_J2 */
      val SMART_J2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
