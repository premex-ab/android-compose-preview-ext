package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAELITE device specifications for Android Compose previews.
 *
 * This extension provides SAELITE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Saelite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Saelite: Any
  get() = object {
      /** SAELITE MD1063B */
      val MD1063B = "spec:width=800,height=1280,unit=px,dpi=160"

  }
