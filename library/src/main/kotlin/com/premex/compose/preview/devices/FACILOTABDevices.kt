package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FACILOTAB device specifications for Android Compose previews.
 *
 * This extension provides FACILOTAB device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FACILOTAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FACILOTAB: Any
  get() = object {
      /** FACILOTAB Facilotab_L_Rubis */
      val FACILOTAB_L_RUBIS = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
