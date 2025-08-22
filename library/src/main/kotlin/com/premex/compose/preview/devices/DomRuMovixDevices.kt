package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dom-ru_MOVIX device specifications for Android Compose previews.
 *
 * This extension provides Dom-ru_MOVIX device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DomRuMovix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DomRuMovix: Any
  get() = object {
      /** Dom-ru_MOVIX SEI200 */
      val SEI200 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
