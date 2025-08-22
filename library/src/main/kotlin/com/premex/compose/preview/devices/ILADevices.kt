package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ILA device specifications for Android Compose previews.
 *
 * This extension provides ILA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ILA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ILA: Any
  get() = object {
      /** ILA C3 */
      val C3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ILA E1_Plus */
      val E1_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** ILA E3 */
      val E3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ILA ILA_C1 */
      val ILA_C1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ILA ILA_E1 */
      val ILA_E1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ILA ILA_R1 */
      val ILA_R1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ILA ILA_X1 */
      val ILA_X1 = "spec:width=720,height=1498,unit=px,dpi=320"

      /** ILA ILA_X2 */
      val ILA_X2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ILA ILA_X3 */
      val ILA_X3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** ILA R1_Lite */
      val R1_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
