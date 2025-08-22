package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Vocal device specifications for Android Compose previews.
 *
 * This extension provides Vocal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vocal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vocal: Any
  get() = object {
      /** Vocal v0 */
      val V0 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Vocal V01 */
      val V01 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Vocal V0Core */
      val V0CORE = "spec:width=480,height=854,unit=px,dpi=200"

      /** Vocal v1 */
      val V1 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Vocal V11 */
      val V11 = "spec:width=720,height=1612,unit=px,dpi=280"

  }
