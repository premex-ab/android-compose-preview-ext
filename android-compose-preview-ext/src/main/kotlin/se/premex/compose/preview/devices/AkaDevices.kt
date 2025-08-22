package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AKA device specifications for Android Compose previews.
 *
 * This extension provides AKA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aka.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aka: Any
  get() = object {
      /** AKA Model_A */
      val MODEL_A = "spec:width=480,height=854,unit=px,dpi=240"

  }
