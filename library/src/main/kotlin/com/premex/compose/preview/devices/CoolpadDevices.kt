package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Coolpad device specifications for Android Compose previews.
 *
 * This extension provides Coolpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Coolpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Coolpad: Any
  get() = object {
      /** Coolpad A8 */
      val A8 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Coolpad A8-831 */
      val A8_831 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Coolpad A8-930 */
      val A8_930 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Coolpad apollo */
      val APOLLO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Coolpad B770 */
      val B770 = "spec:width=540,height=960,unit=px,dpi=240"

      /** Coolpad C103 */
      val C103 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Coolpad C1-S02 */
      val C1_S02 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Coolpad Coolpad5267 */
      val COOLPAD5267 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Coolpad Coolpad5370 */
      val COOLPAD5370 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad Coolpad7295A */
      val COOLPAD7295A = "spec:width=480,height=854,unit=px,dpi=213"

      /** Coolpad Coolpad8737A */
      val COOLPAD8737A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad CoolpadE2 */
      val COOLPADE2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad Coolpad_1803 */
      val COOLPAD_1803 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Coolpad Coolpad_2041 */
      val COOLPAD_2041 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Coolpad Coolpad_2041_S0 */
      val COOLPAD_2041_S0 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Coolpad Coolpad_2041_U0 */
      val COOLPAD_2041_U0 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Coolpad cool_c1 */
      val COOL_C1 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Coolpad CP12t */
      val CP12T = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Coolpad cp3320a */
      val CP3320A = "spec:width=480,height=800,unit=px,dpi=240"

      /** Coolpad CP3503I */
      val CP3503I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad CP3503L */
      val CP3503L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Coolpad CP3504L */
      val CP3504L = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Coolpad CP3505I */
      val CP3505I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad CP3505I_U00 */
      val CP3505I_U00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad CP3600I */
      val CP3600I = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Coolpad cp3622a */
      val CP3622A = "spec:width=480,height=854,unit=px,dpi=240"

      /** Coolpad cp3632a */
      val CP3632A = "spec:width=480,height=854,unit=px,dpi=240"

      /** Coolpad cp3636a */
      val CP3636A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad cp3648a */
      val CP3648A = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Coolpad cp3648at */
      val CP3648AT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Coolpad CP3667AT */
      val CP3667AT = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Coolpad CP3669AS */
      val CP3669AS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Coolpad CP8676_I03 */
      val CP8676_I03 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Coolpad CP8722_S00 */
      val CP8722_S00 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Coolpad CP8722_U00 */
      val CP8722_U00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad CPY83_I00 */
      val CPY83_I00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad CPY83_S00 */
      val CPY83_S00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad CPY83_U00 */
      val CPY83_U00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad E561_EU */
      val E561_EU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad K2L_S00 */
      val K2L_S00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad k69v1_64 */
      val K69V1_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Coolpad lithium */
      val LITHIUM = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Coolpad R108 */
      val R108 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad ventura */
      val VENTURA = "spec:width=480,height=854,unit=px,dpi=240"

      /** Coolpad victor */
      val VICTOR = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Coolpad Y72_921 */
      val Y72_921 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad Y91 */
      val Y91 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Coolpad 1821 */
      val _1821 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Coolpad 1826-I01 */
      val _1826_I01 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Coolpad 1901 */
      val _1901 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Coolpad 8750 */
      val _8750 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
