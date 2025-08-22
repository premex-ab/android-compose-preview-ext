package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BMAX device specifications for Android Compose previews.
 *
 * This extension provides BMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bmax: Any
  get() = object {
      /** BMAX BMAX_I9 */
      val BMAX_I9 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMAX I10 */
      val I10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BMAX I10Pro_LTE */
      val I10PRO_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I10Pro_LTE_EEA */
      val I10PRO_LTE_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I10_EEA */
      val I10_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BMAX I10_LTE */
      val I10_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I10_Plus */
      val I10_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I10_Plus_EEA */
      val I10_PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** BMAX I10_Plus_LTE */
      val I10_PLUS_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I10_Plus_WLAN */
      val I10_PLUS_WLAN = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I10_Pro_EEA */
      val I10_PRO_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BMAX I10_Pro_LTE */
      val I10_PRO_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I10_Pro_LTE_EEA */
      val I10_PRO_LTE_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I10_Pro_ROW */
      val I10_PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BMAX I10_S_Pro */
      val I10_S_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** BMAX I11 */
      val I11 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** BMAX I11_EEA */
      val I11_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** BMAX I11_LTE */
      val I11_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I11_Plus */
      val I11_PLUS = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** BMAX I11_Plus_EEA */
      val I11_PLUS_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** BMAX I11_Plus_LTE */
      val I11_PLUS_LTE = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** BMAX I11_Plus_LTE_EEA */
      val I11_PLUS_LTE_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** BMAX I11_Power */
      val I11_POWER = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** BMAX I11_Power_LTE */
      val I11_POWER_LTE = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** BMAX I11_S */
      val I11_S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I8 */
      val I8 = "spec:width=1536,height=2048,unit=px,dpi=240"

      /** BMAX I8_Plus */
      val I8_PLUS = "spec:width=800,height=1340,unit=px,dpi=213"

      /** BMAX I9_Plus_EEA */
      val I9_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I9_Plus_ROW */
      val I9_PLUS_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I9_Plus_WIFIOnly */
      val I9_PLUS_WIFIONLY = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMAX I9_Plus_WIFI_EEA */
      val I9_PLUS_WIFI_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BMAX I9_Plus_WIFI_ROW */
      val I9_PLUS_WIFI_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** BMAX I9_Plus_WLAN */
      val I9_PLUS_WLAN = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMAX I9_Plus_Wlanonly */
      val I9_PLUS_WLANONLY = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMAX I9_Plus_Wlanonly_EEA */
      val I9_PLUS_WLANONLY_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BMAX I9_Plus_WLAN_EEA */
      val I9_PLUS_WLAN_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
