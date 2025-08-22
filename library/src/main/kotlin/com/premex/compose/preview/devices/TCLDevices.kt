package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TCL device specifications for Android Compose previews.
 *
 * This extension provides TCL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TCL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TCL: Any
  get() = object {
      /** TCL A30ATMO */
      val A30ATMO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL A3A */
      val A3A = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL A3A_10_4G */
      val A3A_10_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL A3A_8_4G */
      val A3A_8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL A3A_8_4G_TMO */
      val A3A_8_4G_TMO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL A3A_LITE */
      val A3A_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL A3A_PLUS */
      val A3A_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL A3A_XL_3G */
      val A3A_XL_3G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL A3A_XL_4G */
      val A3A_XL_4G = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** TCL A5A_INFINI */
      val A5A_INFINI = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL A5X */
      val A5X = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TCL A70AXLTMO */
      val A70AXLTMO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** TCL Alto45 */
      val ALTO45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL ALTO45TMO */
      val ALTO45TMO = "spec:width=540,height=960,unit=px,dpi=240"

      /** TCL alto4_8g */
      val ALTO4_8G = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCL alto5 */
      val ALTO5 = "spec:width=480,height=854,unit=px,dpi=213"

      /** TCL alto5_premium */
      val ALTO5_PREMIUM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL alto5_sporty */
      val ALTO5_SPORTY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Ant */
      val ANT = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Apollo84GBoostR */
      val APOLLO84GBOOSTR = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Apollo84GUSCC */
      val APOLLO84GUSCC = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Apollo_8_4G */
      val APOLLO_8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Aquaman_10_4G */
      val AQUAMAN_10_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Aquaman_10_KDDI */
      val AQUAMAN_10_KDDI = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Aquaman_10_Pro */
      val AQUAMAN_10_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Aquaman_10_Smart_WIFI */
      val AQUAMAN_10_SMART_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TCL Ares_11_4G */
      val ARES_11_4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Ares_11_WIFI */
      val ARES_11_WIFI = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Ares_Vis_WIFI */
      val ARES_VIS_WIFI = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Aster */
      val ASTER = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Aster_Pro */
      val ASTER_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Austin */
      val AUSTIN = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TCL Austin_TF */
      val AUSTIN_TF = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TCL Austin_US */
      val AUSTIN_US = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TCL Bangkok_TF */
      val BANGKOK_TF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Bee_One */
      val BEE_ONE = "spec:width=540,height=1092,unit=px,dpi=240"

      /** TCL Bellona_WF_GL */
      val BELLONA_WF_GL = "spec:width=1440,height=2200,unit=px,dpi=320"

      /** TCL Benz */
      val BENZ = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL Beryl_TMO */
      val BERYL_TMO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL BeyondTV4 */
      val BEYONDTV4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TCL Bora_NA_OM */
      val BORA_NA_OM = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Bora_TF */
      val BORA_TF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Bora_TMO */
      val BORA_TMO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Boston */
      val BOSTON = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TCL Bremen_NA_OM */
      val BREMEN_NA_OM = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Bremen_TF */
      val BREMEN_TF = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Buffalo */
      val BUFFALO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Buffalo_Boost */
      val BUFFALO_BOOST = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Buffalo_CAN */
      val BUFFALO_CAN = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Buffalo_TMO */
      val BUFFALO_TMO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL BUZZ6E */
      val BUZZ6E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL BUZZ6T4G */
      val BUZZ6T4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL BUZZ6T4GCRICKET */
      val BUZZ6T4GCRICKET = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL BUZZ6T4GGOPHONE */
      val BUZZ6T4GGOPHONE = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL BUZZ6T4GTELUS */
      val BUZZ6T4GTELUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL BUZZ6T4GTFUMTS */
      val BUZZ6T4GTFUMTS = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL BUZZ6_55 */
      val BUZZ6_55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL C05 */
      val C05 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TCL C06 */
      val C06 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TCL Challenger_CS */
      val CHALLENGER_CS = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Challenger_TH */
      val CHALLENGER_TH = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Challenger_TMO */
      val CHALLENGER_TMO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Civic */
      val CIVIC = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Civic_Plus */
      val CIVIC_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Civic_S */
      val CIVIC_S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Civic_S_Refresh */
      val CIVIC_S_REFRESH = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Corolla */
      val COROLLA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL CROSS2 */
      val CROSS2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL Cruze */
      val CRUZE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Cruze_Lite */
      val CRUZE_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Cruze_Lite_S */
      val CRUZE_LITE_S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Cruze_Lite_TF */
      val CRUZE_LITE_TF = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Cruze_Pro */
      val CRUZE_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Curie */
      val CURIE = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL Delhi_TF */
      val DELHI_TF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Doha_TMO */
      val DOHA_TMO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Dragonfly */
      val DRAGONFLY = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Dragonfly_CAN */
      val DRAGONFLY_CAN = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Dragonfly_OM */
      val DRAGONFLY_OM = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Dragonfly_TF */
      val DRAGONFLY_TF = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Dragonfly_VZW */
      val DRAGONFLY_VZW = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Dubai_Plus_ATT */
      val DUBAI_PLUS_ATT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Dubai_VZW */
      val DUBAI_VZW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL E8 */
      val E8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL EasyTAB8MPCS */
      val EASYTAB8MPCS = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL EasyTAB8TMO */
      val EASYTAB8TMO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Eclipse */
      val ECLIPSE = "spec:width=540,height=960,unit=px,dpi=240"

      /** TCL Edison */
      val EDISON = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Edison_CKT */
      val EDISON_CKT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL EDISON_TF */
      val EDISON_TF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL ELSA6 */
      val ELSA6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL ELSA6P */
      val ELSA6P = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL elsa6_amz */
      val ELSA6_AMZ = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL elsa6_na */
      val ELSA6_NA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Encore_CAN */
      val ENCORE_CAN = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Encore_OM */
      val ENCORE_OM = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Encore_Spectrum */
      val ENCORE_SPECTRUM = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Encore_TF */
      val ENCORE_TF = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Encore_USCC */
      val ENCORE_USCC = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Encore_Visible */
      val ENCORE_VISIBLE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Encore_VZW */
      val ENCORE_VZW = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL EOS_lte */
      val EOS_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Erica_NP_Pro */
      val ERICA_NP_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Eternals11 */
      val ETERNALS11 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** TCL Faraday */
      val FARADAY = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL feijao */
      val FEIJAO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL FERMI_ATT */
      val FERMI_ATT = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL FERMI_TF */
      val FERMI_TF = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL Firefly */
      val FIREFLY = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Freyr_10_1_4G */
      val FREYR_10_1_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL Freyr_10_1_WiFi */
      val FREYR_10_1_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL Freyr_Pro_4G_U */
      val FREYR_PRO_4G_U = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL G05 */
      val G05 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TCL G06 */
      val G06 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TCL G07 */
      val G07 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TCL G08 */
      val G08 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** TCL G09 */
      val G09 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** TCL G10 */
      val G10 = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** TCL G13 */
      val G13 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** TCL Gaia */
      val GAIA = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** TCL Gauss */
      val GAUSS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL Goldfinch_Dish */
      val GOLDFINCH_DISH = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Goldfinch_NP */
      val GOLDFINCH_NP = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Goldfinch_NP_Pro */
      val GOLDFINCH_NP_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Goldfinch_Pro_CS */
      val GOLDFINCH_PRO_CS = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Goldfinch_TMO */
      val GOLDFINCH_TMO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL HANDYT2 */
      val HANDYT2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Hera_Vis_WIFI */
      val HERA_VIS_WIFI = "spec:width=1600,height=2400,unit=px,dpi=320"

      /** TCL Hero2C */
      val HERO2C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL HONG_KONG */
      val HONG_KONG = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Hong_Kong_Pro */
      val HONG_KONG_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL I1-5_4G */
      val I1_5_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL idol3 */
      val IDOL3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL idol347 */
      val IDOL347 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL idol4 */
      val IDOL4 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL idol4s */
      val IDOL4S = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** TCL idol4s_skt */
      val IDOL4S_SKT = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** TCL IDOL5S */
      val IDOL5S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL Irvine */
      val IRVINE = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TCL Irvine_VZW */
      val IRVINE_VZW = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TCL Jakarta */
      val JAKARTA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TCL Jakarta_Lite */
      val JAKARTA_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TCL Jakarta_Lite_refresh */
      val JAKARTA_LITE_REFRESH = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TCL Jakarta_Mini */
      val JAKARTA_MINI = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL Jetta_ATT */
      val JETTA_ATT = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL Jetta_Dish */
      val JETTA_DISH = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL Jetta_NA_OM */
      val JETTA_NA_OM = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL Jetta_TF */
      val JETTA_TF = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL Jetta_Visible */
      val JETTA_VISIBLE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL Jetta_VZW */
      val JETTA_VZW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL Kona */
      val KONA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Ladybird */
      val LADYBIRD = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Ladybird_Pro */
      val LADYBIRD_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Levin */
      val LEVIN = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Lion-5 */
      val LION_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Logan */
      val LOGAN = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Logan_FHD */
      val LOGAN_FHD = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Lotus */
      val LOTUS = "spec:width=720,height=1612,unit=px,dpi=280"

      /** TCL Luna */
      val LUNA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Luna_8_4G_ATT */
      val LUNA_8_4G_ATT = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Luna_8_4G_TMO */
      val LUNA_8_4G_TMO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Luna_8_4G_VZW */
      val LUNA_8_4G_VZW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** TCL Macau */
      val MACAU = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL Miami_Pro */
      val MIAMI_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TCL Miata_3G */
      val MIATA_3G = "spec:width=540,height=960,unit=px,dpi=240"

      /** TCL MIATA_lte */
      val MIATA_LTE = "spec:width=540,height=960,unit=px,dpi=240"

      /** TCL mickey6 */
      val MICKEY6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Mickey6CC */
      val MICKEY6CC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL mickey6t */
      val MICKEY6T = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Mickey6TFEVDO */
      val MICKEY6TFEVDO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Mickey6TTMO */
      val MICKEY6TTMO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Mickey6TVZW */
      val MICKEY6TVZW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL MICKEY6US */
      val MICKEY6US = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Mickey6VZW */
      val MICKEY6VZW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Model_3 */
      val MODEL_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Morgan_4G */
      val MORGAN_4G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Oakland */
      val OAKLAND = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Odin */
      val ODIN = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Odin2 */
      val ODIN2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Odin5GACG */
      val ODIN5GACG = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Odin_5G */
      val ODIN_5G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Odin_5G_TMO */
      val ODIN_5G_TMO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Optimus_5G_VZW */
      val OPTIMUS_5G_VZW = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** TCL Ottawa */
      val OTTAWA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TCL P3-5_4G */
      val P3_5_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Passat */
      val PASSAT = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TCL Passat_5G */
      val PASSAT_5G = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TCL Pixi2-7_4G_TMO */
      val PIXI2_7_4G_TMO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi3454GSPR */
      val PIXI3454GSPR = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL Pixi3554GEVDO */
      val PIXI3554GEVDO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL pixi37 */
      val PIXI37 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** TCL pixi384g */
      val PIXI384G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL Pixi3-10_3G */
      val PIXI3_10_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL Pixi3-10_WiFi */
      val PIXI3_10_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL PIXI3_35 */
      val PIXI3_35 = "spec:width=320,height=480,unit=px,dpi=160"

      /** TCL Pixi3-35TF */
      val PIXI3_35TF = "spec:width=320,height=480,unit=px,dpi=160"

      /** TCL Pixi3-4 */
      val PIXI3_4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCL Pixi3-45 */
      val PIXI3_45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL PIXI3_45_4G */
      val PIXI3_45_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL PIXI3_4TF */
      val PIXI3_4TF = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCL PIXI3-5 */
      val PIXI3_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL PIXI3-55 */
      val PIXI3_55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Pixi3-7 */
      val PIXI3_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi3-7_3G */
      val PIXI3_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi3_7_4G */
      val PIXI3_7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi3-7_4G_EE */
      val PIXI3_7_4G_EE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi3-8_WIFI */
      val PIXI3_8_WIFI = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL Pixi445 */
      val PIXI445 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL Pixi445CAN */
      val PIXI445CAN = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL Pixi445Cricket */
      val PIXI445CRICKET = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL Pixi445SPR */
      val PIXI445SPR = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL Pixi445TFVZW */
      val PIXI445TFVZW = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL Pixi4PlusPower */
      val PIXI4PLUSPOWER = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL PIXI4-35 */
      val PIXI4_35 = "spec:width=320,height=480,unit=px,dpi=160"

      /** TCL Pixi4-4 */
      val PIXI4_4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCL PIXI4-4C_GO */
      val PIXI4_4C_GO = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCL PIXI4_4TF */
      val PIXI4_4TF = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCL Pixi4-5 */
      val PIXI4_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL PIXI4_55_3G */
      val PIXI4_55_3G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL PIXI4_5_4G */
      val PIXI4_5_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL Pixi4-64GMEX */
      val PIXI4_64GMEX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Pixi4-6_3G */
      val PIXI4_6_3G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Pixi4-6_4G */
      val PIXI4_6_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Pixi4-6_4G_CKT */
      val PIXI4_6_4G_CKT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Pixi4-7_3G */
      val PIXI4_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL PIXI4-7_4G */
      val PIXI4_7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi4-7_4G_Bell */
      val PIXI4_7_4G_BELL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi4-7_4G_Rogers */
      val PIXI4_7_4G_ROGERS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi4-7_4G_Telus */
      val PIXI4_7_4G_TELUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi4-7_4G_TMO */
      val PIXI4_7_4G_TMO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi4-7_WIFI */
      val PIXI4_7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pixi5-10_4G */
      val PIXI5_10_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TCL PIXI5-6_4G */
      val PIXI5_6_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Pixi5-7_3G */
      val PIXI5_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL PIXI5-8_4G_Telus */
      val PIXI5_8_4G_TELUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL PIXI5-8_4G_TMO */
      val PIXI5_8_4G_TMO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL PIXI7 */
      val PIXI7 = "spec:width=540,height=960,unit=px,dpi=160"

      /** TCL PIXI8 */
      val PIXI8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL PIXO7 */
      val PIXO7 = "spec:width=540,height=960,unit=px,dpi=160"

      /** TCL PIXO8_3G */
      val PIXO8_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL PLAY-5 */
      val PLAY_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL PLAY_P1 */
      val PLAY_P1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCL POP10 */
      val POP10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL Pop35 */
      val POP35 = "spec:width=480,height=854,unit=px,dpi=213"

      /** TCL Pop355 */
      val POP355 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL Pop445 */
      val POP445 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL POP45 */
      val POP45 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL POP455C */
      val POP455C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL POP4-10_4G */
      val POP4_10_4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL POP4-6_4G */
      val POP4_6_4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL POP4-7_4G */
      val POP4_7_4G = "spec:width=720,height=1280,unit=px,dpi=240"

      /** TCL POP5-6_4G */
      val POP5_6_4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL POP7 */
      val POP7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL Pop7_LTE */
      val POP7_LTE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL POP8 */
      val POP8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TCL Rapid_CKT */
      val RAPID_CKT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Rapid_USCC */
      val RAPID_USCC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Richland */
      val RICHLAND = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TCL Richland_Pro */
      val RICHLAND_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TCL Rio */
      val RIO = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL RIO_4G */
      val RIO_4G = "spec:width=480,height=800,unit=px,dpi=213"

      /** TCL Rio_CAN */
      val RIO_CAN = "spec:width=480,height=960,unit=px,dpi=220"

      /** TCL Rio_TMO */
      val RIO_TMO = "spec:width=480,height=960,unit=px,dpi=220"

      /** TCL Ruby_TF */
      val RUBY_TF = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Ruby_VZW */
      val RUBY_VZW = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL ScarabLite_TMO */
      val SCARABLITE_TMO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Scarab_Lite_TF */
      val SCARAB_LITE_TF = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Scarab_Pro_NA_OM */
      val SCARAB_PRO_NA_OM = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Scarab_Pro_TF */
      val SCARAB_PRO_TF = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Scarab_Pro_VZW */
      val SCARAB_PRO_VZW = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TCL Seattle */
      val SEATTLE = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TCL Seattle_VZW */
      val SEATTLE_VZW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TCL Seoul */
      val SEOUL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TCL Seoul_ATT */
      val SEOUL_ATT = "spec:width=480,height=960,unit=px,dpi=220"

      /** TCL Seoul_TF */
      val SEOUL_TF = "spec:width=480,height=960,unit=px,dpi=220"

      /** TCL shine_lite */
      val SHINE_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL shine_plus */
      val SHINE_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL SIMBA6L */
      val SIMBA6L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL simba6_cricket */
      val SIMBA6_CRICKET = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL simba6_global */
      val SIMBA6_GLOBAL = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL Sonata_BBH */
      val SONATA_BBH = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Sonata_Pro_OM */
      val SONATA_PRO_OM = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Sonata_TF */
      val SONATA_TF = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL SOUL35 */
      val SOUL35 = "spec:width=320,height=480,unit=px,dpi=160"

      /** TCL SOUL45_GSM */
      val SOUL45_GSM = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL Sunrise_CAN */
      val SUNRISE_CAN = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL Sunrise_NA_OM */
      val SUNRISE_NA_OM = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TCL T1 */
      val T1 = "spec:width=1080,height=2340,unit=px,dpi=320"

      /** TCL T1_LITE */
      val T1_LITE = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TCL T1_PRO */
      val T1_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TCL tcl */
      val TCL = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TCL tcl_eu */
      val TCL_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TCL tcl_sa */
      val TCL_SA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TCL Thor_8_4G_VZW */
      val THOR_8_4G_VZW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** TCL Titan_Vis_Wifi */
      val TITAN_VIS_WIFI = "spec:width=1440,height=2160,unit=px,dpi=320"

      /** TCL Tokyo_Lite */
      val TOKYO_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TCL Tokyo_TF */
      val TOKYO_TF = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TCL Transformer */
      val TRANSFORMER = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** TCL Transformer2 */
      val TRANSFORMER2 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** TCL Transformer_4G */
      val TRANSFORMER_4G = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** TCL Transformer_VZW */
      val TRANSFORMER_VZW = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** TCL U3 */
      val U3 = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCL U3A_10_WIFI */
      val U3A_10_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TCL U3A_7_3G */
      val U3A_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL U3A_7_WIFI */
      val U3A_7_WIFI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL U3A_7_WIFI_Refresh */
      val U3A_7_WIFI_REFRESH = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TCL U3A_PLUS_4G */
      val U3A_PLUS_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL U3_3G */
      val U3_3G = "spec:width=480,height=800,unit=px,dpi=240"

      /** TCL U50APLUSTMO */
      val U50APLUSTMO = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL U50A_ATT */
      val U50A_ATT = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL U50A_PLUS_ATT */
      val U50A_PLUS_ATT = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL U50A_PLUS_TF */
      val U50A_PLUS_TF = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL U50PLUS */
      val U50PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL U5A_PLUS_3G */
      val U5A_PLUS_3G = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL U5A_PLUS_4G */
      val U5A_PLUS_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL U5_3G */
      val U5_3G = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL UnionTV */
      val UNIONTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TCL Venice */
      val VENICE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Venus_4G_GL */
      val VENUS_4G_GL = "spec:width=800,height=1340,unit=px,dpi=240"

      /** TCL Venus_WiFi_GL */
      val VENUS_WIFI_GL = "spec:width=800,height=1340,unit=px,dpi=240"

      /** TCL Vinca */
      val VINCA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TCL Wright */
      val WRIGHT = "spec:width=480,height=960,unit=px,dpi=240"

      /** TCL Wright_Pro */
      val WRIGHT_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TCL X1 */
      val X1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TCL x1_plus */
      val X1_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TCL Xess */
      val XESS = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** TCL Xess-mini */
      val XESS_MINI = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** TCL Yaris5NA */
      val YARIS5NA = "spec:width=480,height=854,unit=px,dpi=240"

      /** TCL 7046T */
      val _7046T = "spec:width=720,height=1280,unit=px,dpi=320"

  }
