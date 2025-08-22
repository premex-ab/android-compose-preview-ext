package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CROSSCALL device specifications for Android Compose previews.
 *
 * This extension provides CROSSCALL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CROSSCALL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CROSSCALL: Any
  get() = object {
      /** CROSSCALL CORE-M4 */
      val CORE_M4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** CROSSCALL CORE-M4-GO */
      val CORE_M4_GO = "spec:width=480,height=960,unit=px,dpi=240"

      /** CROSSCALL HS8917QC */
      val HS8917QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CROSSCALL HS8937QC */
      val HS8937QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CROSSCALL HS8952QC */
      val HS8952QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** CROSSCALL HSSDM660QC */
      val HSSDM660QC = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
