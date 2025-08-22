package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PRAZteck device specifications for Android Compose previews.
 *
 * This extension provides PRAZteck device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PRAZteck.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PRAZteck: Any
  get() = object {
      /** PRAZteck PT7EduPad */
      val PT7EDUPAD = "spec:width=600,height=1024,unit=px,dpi=160"

  }
