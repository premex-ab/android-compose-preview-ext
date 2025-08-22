package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SriLankaTelecom device specifications for Android Compose previews.
 *
 * This extension provides SriLankaTelecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SriLankaTelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SriLankaTelecom: Any
  get() = object {
      /** SriLankaTelecom DV8040 */
      val DV8040 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
