package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LP device specifications for Android Compose previews.
 *
 * This extension provides LP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lp: Any
  get() = object {
      /** LP LP_Legend */
      val LP_LEGEND = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LP LP_N60 */
      val LP_N60 = "spec:width=480,height=960,unit=px,dpi=200"

      /** LP LP_N_50 */
      val LP_N_50 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LP LP_N_57 */
      val LP_N_57 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LP LP_Pro1 */
      val LP_PRO1 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** LP LP_T70 */
      val LP_T70 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** LP LP_T70_Lite */
      val LP_T70_LITE = "spec:width=600,height=1024,unit=px,dpi=213"

      /** LP LP_Vyper */
      val LP_VYPER = "spec:width=480,height=960,unit=px,dpi=240"

      /** LP N60 */
      val N60 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LP N-57 */
      val N_57 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LP N-57-Plus */
      val N_57_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** LP N-60 */
      val N_60 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LP T100 */
      val T100 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LP Vyper_PRO */
      val VYPER_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** LP W55 */
      val W55 = "spec:width=480,height=960,unit=px,dpi=213"

  }
