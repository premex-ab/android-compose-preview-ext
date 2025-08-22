package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kelyx_KL783 device specifications for Android Compose previews.
 *
 * This extension provides Kelyx_KL783 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KelyxKl783.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KelyxKl783: Any
  get() = object {
      /** Kelyx_KL783 AKS01_KL783 */
      val AKS01_KL783 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
