package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HANKOOK_CREA device specifications for Android Compose previews.
 *
 * This extension provides HANKOOK_CREA device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HANKOOKCREA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HANKOOKCREA: Any
  get() = object {
      /** HANKOOK_CREA HANKOOK_CREA_RK3588 */
      val HANKOOK_CREA_RK3588 = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
