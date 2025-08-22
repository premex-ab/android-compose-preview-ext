package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ACTECK device specifications for Android Compose previews.
 *
 * This extension provides ACTECK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Acteck.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Acteck: Any
  get() = object {
      /** ACTECK AC_934312 */
      val AC_934312 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
