package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SHARP device specifications for Android Compose previews.
 *
 * This extension provides SHARP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SHARP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SHARP: Any
  get() = object {
      /** SHARP anaheim */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP an_np40 */
      val AN_NP40 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP awaroa */
      val AWAROA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP Banagher */
      val BANAGHER = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** SHARP banqiao */
      val BANQIAO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP Chara */
      val CHARA = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** SHARP ebisu */
      val EBISU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP egaleo */
      val EGALEO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** SHARP ewha */
      val EWHA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP FaYuiry */
      val FAYUIRY = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SHARP gangnam */
      val GANGNAM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP gilmore */
      val GILMORE = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** SHARP guro */
      val GURO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP HCTT1 */
      val HCTT1 = "spec:width=768,height=1366,unit=px,dpi=160"

      /** SHARP HH1 */
      val HH1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SHARP HH6_sprout */
      val HH6_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** SHARP jamsil */
      val JAMSIL = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP JeridA */
      val JERIDA = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** SHARP Judau */
      val JUDAU = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** SHARP Kamille */
      val KAMILLE = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** SHARP lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP lc_le580t */
      val LC_LE580T = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP lc_le580x */
      val LC_LE580X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP lc_sunuj */
      val LC_SUNUJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP lc_theut */
      val LC_THEUT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP lc_theux */
      val LC_THEUX = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP lc_u35t */
      val LC_U35T = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP lc_ue630x */
      val LC_UE630X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP lc_xu35t */
      val LC_XU35T = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP lc_xu930x_830x */
      val LC_XU930X_830X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP LC-xxLE570X */
      val LC_XXLE570X = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** SHARP Levin */
      val LEVIN = "spec:width=720,height=1612,unit=px,dpi=320"

      /** SHARP Lockon */
      val LOCKON = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SHARP martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP meguro */
      val MEGURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP Mikazuki */
      val MIKAZUKI = "spec:width=1440,height=3120,unit=px,dpi=520"

      /** SHARP Model_3 */
      val MODEL_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SHARP mongkok */
      val MONGKOK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP MS1 */
      val MS1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SHARP namba */
      val NAMBA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP Naze */
      val NAZE = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** SHARP OD0M_EA_T32 */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP OG6 */
      val OG6 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** SHARP Orga */
      val ORGA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SHARP Quattro */
      val QUATTRO = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SHARP Quess */
      val QUESS = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** SHARP R4 */
      val R4 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP Rakan */
      val RAKAN = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** SHARP Recoa */
      val RECOA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SHARP sandiego */
      val SANDIEGO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP Sarah */
      val SARAH = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** SHARP SarahH */
      val SARAHH = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** SHARP SAT */
      val SAT = "spec:width=1080,height=2040,unit=px,dpi=480"

      /** SHARP SD1 */
      val SD1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SHARP SG1 */
      val SG1 = "spec:width=1080,height=2040,unit=px,dpi=420"

      /** SHARP SG306SH */
      val SG306SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SHARP SH825Wi */
      val SH825WI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SHARP SH90B */
      val SH90B = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SHARP sharp_2k15_us_android */
      val SHARP_2K15_US_ANDROID = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP shonandai */
      val SHONANDAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP SH-D01 */
      val SH_D01 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SHARP SH-L02 */
      val SH_L02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SHARP SH-M01 */
      val SH_M01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SHARP SH-M02 */
      val SH_M02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SHARP SH-M02-EVA20 */
      val SH_M02_EVA20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SHARP SH-M03 */
      val SH_M03 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SHARP SH-M04 */
      val SH_M04 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SHARP SH-M05 */
      val SH_M05 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SHARP SH-M06 */
      val SH_M06 = "spec:width=1080,height=2032,unit=px,dpi=480"

      /** SHARP SH-M07 */
      val SH_M07 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SHARP SH-M08 */
      val SH_M08 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SHARP SH-M09 */
      val SH_M09 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** SHARP SH-M10 */
      val SH_M10 = "spec:width=1440,height=2992,unit=px,dpi=640"

      /** SHARP SH-M11 */
      val SH_M11 = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** SHARP SH-M12 */
      val SH_M12 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SHARP SH-M13 */
      val SH_M13 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** SHARP SH-R10 */
      val SH_R10 = "spec:width=1440,height=3120,unit=px,dpi=640"

      /** SHARP SH-RM02 */
      val SH_RM02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SHARP SH-Z01 */
      val SH_Z01 = "spec:width=1080,height=2040,unit=px,dpi=480"

      /** SHARP SH-Z10 */
      val SH_Z10 = "spec:width=1440,height=2992,unit=px,dpi=640"

      /** SHARP SH-Z20 */
      val SH_Z20 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** SHARP sindang */
      val SINDANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP SS2 */
      val SS2 = "spec:width=1080,height=2040,unit=px,dpi=480"

      /** SHARP stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP STTM21VAPP */
      val STTM21VAPP = "spec:width=720,height=1600,unit=px,dpi=280"

      /** SHARP SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP SX1 */
      val SX1 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SHARP SX3 */
      val SX3 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SHARP SX4 */
      val SX4 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** SHARP SX5 */
      val SX5 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** SHARP takao */
      val TAKAO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP tcba8sx */
      val TCBA8SX = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcmar1uj */
      val TCMAR1UJ = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** SHARP tcmar2uj */
      val TCMAR2UJ = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** SHARP tcme8sj */
      val TCME8SJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcme8tsj */
      val TCME8TSJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcmeruj */
      val TCMERUJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcsu2uj */
      val TCSU2UJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcth2ut */
      val TCTH2UT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcth2ux */
      val TCTH2UX = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcve2uj */
      val TCVE2UJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcve8sj */
      val TCVE8SJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcvenruj */
      val TCVENRUJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP tcvenuj */
      val TCVENUJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHARP TSP */
      val TSP = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SHARP umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHARP VG2 */
      val VG2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** SHARP VGO */
      val VGO = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** SHARP VN3N */
      val VN3N = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** SHARP VZJ */
      val VZJ = "spec:width=720,height=1280,unit=px,dpi=320"

  }
