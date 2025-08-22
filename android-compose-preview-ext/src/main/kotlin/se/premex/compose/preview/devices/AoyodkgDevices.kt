package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AOYODKG device specifications for Android Compose previews.
 *
 * This extension provides AOYODKG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aoyodkg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aoyodkg: Any
  get() = object {
      /** AOYODKG M50 */
      val M50 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AOYODKG M50_EEA */
      val M50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
