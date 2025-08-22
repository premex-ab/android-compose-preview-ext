package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * razer device specifications for Android Compose previews.
 *
 * This extension provides razer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Razer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Razer: Any
  get() = object {
      /** razer aura */
      val AURA = "spec:width=1440,height=2560,unit=px,dpi=480"

      /** razer bolt */
      val BOLT = "spec:width=1440,height=2560,unit=px,dpi=480"

      /** razer cheryl */
      val CHERYL = "spec:width=1440,height=2560,unit=px,dpi=480"

      /** razer cheryl_ckh */
      val CHERYL_CKH = "spec:width=1440,height=2560,unit=px,dpi=480"

      /** razer linus */
      val LINUS = "spec:width=1440,height=2560,unit=px,dpi=480"

  }
