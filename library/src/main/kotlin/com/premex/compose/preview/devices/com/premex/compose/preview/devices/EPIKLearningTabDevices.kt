package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EPIK_Learning_Tab device specifications for Android Compose previews.
 *
 * This extension provides EPIK_Learning_Tab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EPIKLearningTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EPIKLearningTab: Any
  get() = object {
      /** DeviceSpec(manufacturer=EPIK_Learning_Tab, code=ELT0801, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EPIK_Learning_Tab, code=ELT0801,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ELT0801 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
