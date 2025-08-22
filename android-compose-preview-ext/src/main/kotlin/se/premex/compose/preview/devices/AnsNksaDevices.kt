package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ANS_NKSA device specifications for Android Compose previews.
 *
 * This extension provides ANS_NKSA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AnsNksa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AnsNksa: Any
  get() = object {
      /** ANS_NKSA NKSA_AQT82 */
      val NKSA_AQT82 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
