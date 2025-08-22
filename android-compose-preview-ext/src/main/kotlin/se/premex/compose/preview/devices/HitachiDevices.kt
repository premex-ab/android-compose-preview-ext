package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HITACHI device specifications for Android Compose previews.
 *
 * This extension provides HITACHI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hitachi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hitachi: Any
  get() = object {
      /** HITACHI R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** HITACHI R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
