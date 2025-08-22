package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AIDATA device specifications for Android Compose previews.
 *
 * This extension provides AIDATA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AIDATA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AIDATA: Any
  get() = object {
      /** AIDATA ADT1012L */
      val ADT1012L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AIDATA ADT1061 */
      val ADT1061 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** AIDATA ADT1061_1 */
      val ADT1061_1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AIDATA ADT_1061 */
      val ADT_1061 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AIDATA ADT-R10TME */
      val ADT_R10TME = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
