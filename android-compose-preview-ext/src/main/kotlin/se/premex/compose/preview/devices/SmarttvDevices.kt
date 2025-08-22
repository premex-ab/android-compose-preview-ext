package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SmartTV device specifications for Android Compose previews.
 *
 * This extension provides SmartTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smarttv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smarttv: Any
  get() = object {
      /** SmartTV SmartTV */
      val SMARTTV = "spec:width=720,height=1280,unit=px,dpi=240"

  }
