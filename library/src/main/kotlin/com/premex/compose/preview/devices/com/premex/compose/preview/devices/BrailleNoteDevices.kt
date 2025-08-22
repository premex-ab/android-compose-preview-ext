package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BrailleNote device specifications for Android Compose previews.
 *
 * This extension provides BrailleNote device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BrailleNote.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BrailleNote: Any
  get() = object {
      /** DeviceSpec(manufacturer=BrailleNote, code=gryphon, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BrailleNote, code=gryphon,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val GRYPHON = "spec:width=600,height=1024,unit=px,dpi=160"

  }
