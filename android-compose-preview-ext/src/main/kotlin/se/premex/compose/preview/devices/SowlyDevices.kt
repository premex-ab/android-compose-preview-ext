package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SOWLY device specifications for Android Compose previews.
 *
 * This extension provides SOWLY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sowly.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sowly: Any
  get() = object {
      /** SOWLY AG_1088_A133 */
      val AG_1088_A133 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SOWLY AG_1088_A133P */
      val AG_1088_A133P = "spec:width=800,height=1280,unit=px,dpi=160"

  }
