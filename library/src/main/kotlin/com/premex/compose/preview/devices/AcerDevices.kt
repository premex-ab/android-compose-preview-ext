package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * acer device specifications for Android Compose previews.
 *
 * This extension provides acer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Acer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Acer: Any
  get() = object {
      /** acer acer_A10M1 */
      val ACER_A10M1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer acer_A11M1 */
      val ACER_A11M1 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** acer acer_A8M1 */
      val ACER_A8M1 = "spec:width=800,height=1340,unit=px,dpi=213"

      /** acer acer_aprilia */
      val ACER_APRILIA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** acer acer_apriliahd */
      val ACER_APRILIAHD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer acer_asgard */
      val ACER_ASGARD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer acer_asgardfhd */
      val ACER_ASGARDFHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer acer_asgardlte */
      val ACER_ASGARDLTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer acer_barricade */
      val ACER_BARRICADE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** acer acer_barricadewifi */
      val ACER_BARRICADEWIFI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** acer acer_barricade_3G */
      val ACER_BARRICADE_3G = "spec:width=720,height=1280,unit=px,dpi=213"

      /** acer acer_c01 */
      val ACER_C01 = "spec:width=480,height=640,unit=px,dpi=240"

      /** acer acer_Colnago */
      val ACER_COLNAGO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer acer_ColnagoFHD */
      val ACER_COLNAGOFHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer acer_e39 */
      val ACER_E39 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_FrenzyRefresh */
      val ACER_FRENZYREFRESH = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer acer_harley */
      val ACER_HARLEY = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer acer_harleyfhd */
      val ACER_HARLEYFHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer acer_jetfirefhd */
      val ACER_JETFIREFHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer acer_jetfirehd */
      val ACER_JETFIREHD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer acer_jetfirelte */
      val ACER_JETFIRELTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer acer_P10M2 */
      val ACER_P10M2 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** acer acer_S57 */
      val ACER_S57 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_T02 */
      val ACER_T02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_t03 */
      val ACER_T03 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_t04 */
      val ACER_T04 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_t06 */
      val ACER_T06 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_t07 */
      val ACER_T07 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_t08 */
      val ACER_T08 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_t09 */
      val ACER_T09 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_t10 */
      val ACER_T10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_t11 */
      val ACER_T11 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** acer acer_Titan */
      val ACER_TITAN = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer acer_V10M2 */
      val ACER_V10M2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer acer_V11M1 */
      val ACER_V11M1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer acer_Vulcan */
      val ACER_VULCAN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** acer acer_X12M1 */
      val ACER_X12M1 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** acer acer_z410 */
      val ACER_Z410 = "spec:width=480,height=854,unit=px,dpi=240"

      /** acer acer_Z500 */
      val ACER_Z500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** acer acer_z520 */
      val ACER_Z520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** acer acer_Zipp */
      val ACER_ZIPP = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer ACTAB1024 */
      val ACTAB1024 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer ACTAB10KB24 */
      val ACTAB10KB24 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer ACTAB1123 */
      val ACTAB1123 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** acer ACTAB1422 */
      val ACTAB1422 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** acer ACTAB723 */
      val ACTAB723 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** acer ACTABKID */
      val ACTABKID = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer ATAB1024E */
      val ATAB1024E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer ATAB10KB24E */
      val ATAB10KB24E = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer ATAB1123E */
      val ATAB1123E = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** acer ATAB1422E */
      val ATAB1422E = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** acer ATAB723E */
      val ATAB723E = "spec:width=600,height=1024,unit=px,dpi=160"

      /** acer ATABKD1024K */
      val ATABKD1024K = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer ATLTE1022 */
      val ATLTE1022 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer ATLTE1022E */
      val ATLTE1022E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer B1-710 */
      val B1_710 = "spec:width=600,height=976,unit=px,dpi=160"

      /** acer B1-711 */
      val B1_711 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** acer b1-720 */
      val B1_720 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** acer B1-A71 */
      val B1_A71 = "spec:width=600,height=976,unit=px,dpi=160"

      /** acer Battlezone */
      val BATTLEZONE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer Battlezone_LTE */
      val BATTLEZONE_LTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer Baymax */
      val BAYMAX = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer C11 */
      val C11 = "spec:width=540,height=960,unit=px,dpi=240"

      /** acer citizen */
      val CITIZEN = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer ducati */
      val DUCATI = "spec:width=768,height=1024,unit=px,dpi=160"

      /** acer ducati2fhd */
      val DUCATI2FHD = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** acer ducati2hd */
      val DUCATI2HD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer ducati2hd3g */
      val DUCATI2HD3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer Frontier */
      val FRONTIER = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** acer mango */
      val MANGO = "spec:width=768,height=1024,unit=px,dpi=160"

      /** acer oban */
      val OBAN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** acer omega */
      val OMEGA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer P11 */
      val P11 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** acer picasso_e2 */
      val PICASSO_E2 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** acer picasso_m */
      val PICASSO_M = "spec:width=752,height=1280,unit=px,dpi=160"

      /** acer picasso_mf */
      val PICASSO_MF = "spec:width=1128,height=1920,unit=px,dpi=240"

      /** acer rolex */
      val ROLEX = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** acer T01 */
      val T01 = "spec:width=480,height=854,unit=px,dpi=240"

      /** acer T012 */
      val T012 = "spec:width=480,height=854,unit=px,dpi=240"

      /** acer Tattoo */
      val TATTOO = "spec:width=800,height=1280,unit=px,dpi=200"

      /** acer Ultimo */
      val ULTIMO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** acer vespa */
      val VESPA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer vespa2 */
      val VESPA2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer vespa8 */
      val VESPA8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** acer vespatn */
      val VESPATN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** acer Walle */
      val WALLE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer z220 */
      val Z220 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** acer zara */
      val ZARA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** acer ZX */
      val ZX = "spec:width=320,height=480,unit=px,dpi=160"

  }
