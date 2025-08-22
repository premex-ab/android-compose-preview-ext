package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EAGIESOAR device specifications for Android Compose previews.
 *
 * This extension provides EAGIESOAR device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EAGIESOAR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EAGIESOAR: Any
  get() = object {
      /** EAGIESOAR EE1010_EEA */
      val EE1010_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
