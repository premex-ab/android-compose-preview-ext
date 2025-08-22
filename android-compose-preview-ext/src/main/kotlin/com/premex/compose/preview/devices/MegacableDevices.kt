package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Megacable device specifications for Android Compose previews.
 *
 * This extension provides Megacable device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Megacable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Megacable: Any
  get() = object {
      /** Megacable B826C-A12_ZTE */
      val B826C_A12_ZTE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Megacable B866V2F */
      val B866V2F = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Megacable B866V2_ZTE */
      val B866V2_ZTE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Megacable HP46A */
      val HP46A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Megacable ucw4046meg */
      val UCW4046MEG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Megacable uiw4059meg */
      val UIW4059MEG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
