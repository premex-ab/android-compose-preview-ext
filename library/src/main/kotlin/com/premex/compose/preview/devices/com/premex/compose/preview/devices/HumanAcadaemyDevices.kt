package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Human_Acadaemy device specifications for Android Compose previews.
 *
 * This extension provides Human_Acadaemy device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HumanAcadaemy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HumanAcadaemy: Any
  get() = object {
      /** DeviceSpec(manufacturer=Human_Acadaemy, code=HA-007, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Human_Acadaemy, code=HA-007,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val HA_007 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
