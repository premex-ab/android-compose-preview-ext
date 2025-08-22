package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Optimum device specifications for Android Compose previews.
 *
 * This extension provides Optimum device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Optimum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Optimum: Any
  get() = object {
      /** Optimum DIW377AUSA */
      val DIW377AUSA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
