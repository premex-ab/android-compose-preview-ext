package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOUCHMATE device specifications for Android Compose previews.
 *
 * This extension provides TOUCHMATE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Touchmate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Touchmate: Any
  get() = object {
      /** TOUCHMATE TM-MID1010 */
      val TM_MID1010 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TOUCHMATE TM-MID1010NB */
      val TM_MID1010NB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TOUCHMATE TM-MID1050B */
      val TM_MID1050B = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** TOUCHMATE TM-MID1065 */
      val TM_MID1065 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TOUCHMATE TM-MID1080 */
      val TM_MID1080 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** TOUCHMATE TM-MID880PRO */
      val TM_MID880PRO = "spec:width=800,height=1280,unit=px,dpi=240"

  }
