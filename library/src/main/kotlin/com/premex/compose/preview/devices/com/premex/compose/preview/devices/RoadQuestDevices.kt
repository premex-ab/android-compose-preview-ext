package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RoadQuest device specifications for Android Compose previews.
 *
 * This extension provides RoadQuest device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RoadQuest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RoadQuest: Any
  get() = object {
      /** DeviceSpec(manufacturer=RoadQuest, code=RQ-G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RoadQuest, code=RQ-G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RQ_G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
