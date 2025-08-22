package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KULT device specifications for Android Compose previews.
 *
 * This extension provides KULT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kult.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kult: Any
  get() = object {
      /** KULT KT05 */
      val KT05 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
