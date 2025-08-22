package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LEAGOO device specifications for Android Compose previews.
 *
 * This extension provides LEAGOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Leagoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Leagoo: Any
  get() = object {
      /** LEAGOO KIICAA_MIX */
      val KIICAA_MIX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LEAGOO KIICAA_POWER */
      val KIICAA_POWER = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LEAGOO LeaPad_X */
      val LEAPAD_X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LEAGOO M11 */
      val M11 = "spec:width=480,height=996,unit=px,dpi=240"

      /** LEAGOO M12 */
      val M12 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** LEAGOO M12A */
      val M12A = "spec:width=720,height=1520,unit=px,dpi=320"

      /** LEAGOO M13 */
      val M13 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** LEAGOO M9 */
      val M9 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** LEAGOO M9_Pro */
      val M9_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LEAGOO P1 */
      val P1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LEAGOO P1_Pro */
      val P1_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LEAGOO Power_2 */
      val POWER_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LEAGOO Power_2_Pro */
      val POWER_2_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LEAGOO Power_5 */
      val POWER_5 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** LEAGOO S11 */
      val S11 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** LEAGOO S8 */
      val S8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LEAGOO S8Pro */
      val S8PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** LEAGOO S9 */
      val S9 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** LEAGOO T5 */
      val T5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LEAGOO T5c */
      val T5C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LEAGOO T8 */
      val T8 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LEAGOO T8s */
      val T8S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LEAGOO XRover */
      val XROVER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LEAGOO XRover_C */
      val XROVER_C = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LEAGOO Z10 */
      val Z10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LEAGOO Z9 */
      val Z9 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LEAGOO Z9A */
      val Z9A = "spec:width=480,height=854,unit=px,dpi=240"

  }
