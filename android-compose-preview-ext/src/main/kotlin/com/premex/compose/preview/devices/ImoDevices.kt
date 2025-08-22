package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IMO device specifications for Android Compose previews.
 *
 * This extension provides IMO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imo: Any
  get() = object {
      /** IMO IMO_Q2_Plus */
      val IMO_Q2_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** IMO IMO_Q2_Pro */
      val IMO_Q2_PRO = "spec:width=480,height=800,unit=px,dpi=213"

      /** IMO IMO_Q3_Plus */
      val IMO_Q3_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** IMO IMO_Q4_Pro */
      val IMO_Q4_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** IMO IMO_Q5 */
      val IMO_Q5 = "spec:width=480,height=960,unit=px,dpi=200"

      /** IMO S2 */
      val S2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
