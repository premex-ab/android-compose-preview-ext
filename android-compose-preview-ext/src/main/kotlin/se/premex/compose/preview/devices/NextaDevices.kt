package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Nexta device specifications for Android Compose previews.
 *
 * This extension provides Nexta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nexta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nexta: Any
  get() = object {
      /** Nexta Smart_Study_1 */
      val SMART_STUDY_1 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
