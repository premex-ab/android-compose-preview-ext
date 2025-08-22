package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ALPINE device specifications for Android Compose previews.
 *
 * This extension provides ALPINE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alpine.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alpine: Any
  get() = object {
      /** ALPINE INE-AW409S */
      val INE_AW409S = "spec:width=720,height=1280,unit=px,dpi=160"

      /** ALPINE INE-AX809 */
      val INE_AX809 = "spec:width=720,height=1280,unit=px,dpi=160"

  }
