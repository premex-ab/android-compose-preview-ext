package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SOWLY device specifications for Android Compose previews.
 *
 * This extension provides SOWLY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SOWLY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SOWLY: Any
  get() = object {
      /** SOWLY AG_1088_A133 */
      val AG_1088_A133 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SOWLY AG_1088_A133P */
      val AG_1088_A133P = "spec:width=800,height=1280,unit=px,dpi=160"

  }
