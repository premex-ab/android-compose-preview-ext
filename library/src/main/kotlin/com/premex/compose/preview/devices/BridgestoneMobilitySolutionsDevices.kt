package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bridgestone_Mobility_Solutions device specifications for Android Compose previews.
 *
 * This extension provides Bridgestone_Mobility_Solutions device specifications that can be used
 * with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BridgestoneMobilitySolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BridgestoneMobilitySolutions: Any
  get() = object {
      /** Bridgestone_Mobility_Solutions poseidon */
      val POSEIDON = "spec:width=800,height=1280,unit=px,dpi=200"

  }
