package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Alldocube device specifications for Android Compose previews.
 *
 * This extension provides Alldocube device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alldocube.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alldocube: Any
  get() = object {
      /** Alldocube iPlay50_mini_Pro */
      val IPLAY50_MINI_PRO = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** Alldocube iPlay60_mini */
      val IPLAY60_MINI = "spec:width=800,height=1340,unit=px,dpi=213"

      /** Alldocube iPlay60_mini_Pro */
      val IPLAY60_MINI_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Alldocube iPlay60_Pro */
      val IPLAY60_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Alldocube iPlay60_S_4G */
      val IPLAY60_S_4G = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Alldocube iPlay_20 */
      val IPLAY_20 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Alldocube iPlay_70_Pro */
      val IPLAY_70_PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Alldocube iPlay_70_S */
      val IPLAY_70_S = "spec:width=1280,height=1920,unit=px,dpi=210"

      /** Alldocube KidzPad_Pro */
      val KIDZPAD_PRO = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** Alldocube Smile_1 */
      val SMILE_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Alldocube T1012 */
      val T1012 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** Alldocube T1016 */
      val T1016 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Alldocube T1020H */
      val T1020H = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Alldocube T1020S */
      val T1020S = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Alldocube T1021 */
      val T1021 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Alldocube T1021P */
      val T1021P = "spec:width=1200,height=1920,unit=px,dpi=350"

      /** Alldocube T1021PM */
      val T1021PM = "spec:width=1200,height=1920,unit=px,dpi=380"

      /** Alldocube T1021T */
      val T1021T = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Alldocube T1023 */
      val T1023 = "spec:width=1280,height=1920,unit=px,dpi=320"

      /** Alldocube T1026 */
      val T1026 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Alldocube T1028 */
      val T1028 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Alldocube T1029T */
      val T1029T = "spec:width=800,height=1280,unit=px,dpi=210"

      /** Alldocube T1029TA */
      val T1029TA = "spec:width=800,height=1280,unit=px,dpi=210"

      /** Alldocube T1030 */
      val T1030 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Alldocube T1030M */
      val T1030M = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Alldocube T1030MAN */
      val T1030MAN = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Alldocube T1030X */
      val T1030X = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Alldocube T1102T */
      val T1102T = "spec:width=1200,height=2000,unit=px,dpi=360"

      /** Alldocube T1103T */
      val T1103T = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Alldocube T1201 */
      val T1201 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Alldocube T701_X */
      val T701_X = "spec:width=720,height=1280,unit=px,dpi=300"

      /** Alldocube T802 */
      val T802 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Alldocube U1008 */
      val U1008 = "spec:width=1280,height=1920,unit=px,dpi=320"

      /** Alldocube U1030 */
      val U1030 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Alldocube U1033 */
      val U1033 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Alldocube U807 */
      val U807 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Alldocube U812 */
      val U812 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
