package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Disney_Pixar device specifications for Android Compose previews.
 *
 * This extension provides Disney_Pixar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DisneyPixar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DisneyPixar: Any
  get() = object {
      /** DeviceSpec(manufacturer=Disney_Pixar, code=Toy_story, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Disney_Pixar, code=Toy_story,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TOY_STORY = "spec:width=600,height=1024,unit=px,dpi=160"

  }
