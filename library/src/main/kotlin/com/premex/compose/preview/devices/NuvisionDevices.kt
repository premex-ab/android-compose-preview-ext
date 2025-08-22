package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NUVISION device specifications for Android Compose previews.
 *
 * This extension provides NUVISION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nuvision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nuvision: Any
  get() = object {
      /** NUVISION TM800AM */
      val TM800AM = "spec:width=800,height=1280,unit=px,dpi=160"

  }
